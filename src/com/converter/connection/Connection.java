package com.converter.connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;

public class Connection implements AutoCloseable {
	
	  private URLConnection connection;

	  public Connection(String direction) {
	    URL url = null;
	    try {
	      url = new URL(direction);
	    } catch (MalformedURLException e) {

	      JOptionPane.showMessageDialog(null, "Failed to create URL: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }

	    try {
	      connection = url.openConnection();
	    } catch (IOException e) {
	      JOptionPane.showMessageDialog(null, "Failed to open connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }

	    try {
	      connection.connect();
	    } catch (IOException e) {
	      JOptionPane.showMessageDialog(null, "Failed to establish connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	  }
	
	public String readAnswer() {

		  StringBuilder content = new StringBuilder();

		  BufferedReader reader = null;
		  try {
		    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    String line;
		    while ((line = reader.readLine()) != null) {
		      content.append(line);
		      content.append("\n");
		    }
		  } catch (IOException e) {
		    JOptionPane.showMessageDialog(null, "Error reading response: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		  } finally {
		    if (reader != null) {
		      try {
		        reader.close();
		      } catch (IOException e) {
		        JOptionPane.showMessageDialog(null, "Failed to close reader: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		      }
		    }
		  }

		  return content.toString();
		}

	@Override
	public void close() throws Exception {
		if (connection != null) {
			((java.net.HttpURLConnection) connection).disconnect();
		}
	}

}

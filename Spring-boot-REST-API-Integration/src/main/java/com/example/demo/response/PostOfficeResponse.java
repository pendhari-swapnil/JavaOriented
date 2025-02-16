/**
 * 
 */
package com.example.demo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author HP
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostOfficeResponse {
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOfficeBean> postOfficeBean;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeBean> getPostOfficeBean() {
		return postOfficeBean;
	}

	public void setPostOfficeBean(List<PostOfficeBean> postOfficeBean) {
		this.postOfficeBean = postOfficeBean;
	}

	@Override
	public String toString() {
		return "PostOfficeResponse [message=" + message + ", status=" + status + ", postOfficeBean=" + postOfficeBean
				+ "]";
	}

		
}

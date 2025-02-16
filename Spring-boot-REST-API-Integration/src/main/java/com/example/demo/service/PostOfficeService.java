/**
 * 
 */
package com.example.demo.service;

import com.example.demo.response.PostOfficeResponse;

/**
 * @author HP
 *
 */

public interface PostOfficeService {

	public PostOfficeResponse getPostDetailsByPincode(String pinCode, String postUrl);
}

/**
 * 
 */
package com.coredev.product.domain.model;

import lombok.Data;

/**
 * @author Harikrishna
 *
 */
@Data
public class Product {
	String id;
	String name;
	String description;
	double price;
	String startDate;
	String endDate;
}

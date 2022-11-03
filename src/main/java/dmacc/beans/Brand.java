package dmacc.beans;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Oct 28, 2022  
*/

@Embeddable
@Data
@NoArgsConstructor
public class Brand {

	private String brand;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}

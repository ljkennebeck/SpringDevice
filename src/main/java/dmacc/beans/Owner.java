package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Oct 14, 2022  
*/
@Embeddable
@Data
@NoArgsConstructor
public class Owner {
	
	private String name;
	private String number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
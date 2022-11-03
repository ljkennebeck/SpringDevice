package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Device;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Oct 14, 2022  
*/
@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
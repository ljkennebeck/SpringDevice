package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Device;
import dmacc.repository.DeviceRepository;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Oct 28, 2022  
*/
@Controller
public class WebController {
	@Autowired
	DeviceRepository repo;
	
	@GetMapping({"/","viewAll"})
	public String viewAllDevices(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewDevice(model);
		}
		model.addAttribute("devices", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputDevice")
	public String addNewDevice(Model model) {
		Device d = new Device();
		model.addAttribute("newDevice", d);
		return "input";
	}
	
//	@PostMapping("/inputDevice")
//	public String addNewDevice(@ModelAttribute Device d, Model model) {
//		repo.save(d);
//		return viewAllDevices(model);
//	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateDevice(@PathVariable("id") long id, Model model) {
		Device d = repo.findById(id).orElse(null);
		model.addAttribute("newDevice", d);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseDevice(Device d, Model model) {
		repo.save(d);
		return viewAllDevices(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDevice(@PathVariable("id") long id, Model model) {
		Device d = repo.findById(id).orElse(null);
		repo.delete(d);
		return viewAllDevices(model);
	}

}

package com.family.project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.project.entity.FamilyMember;
import com.family.project.service.FamilyMemberServ;

@RestController
@RequestMapping("/FamilyMember")
public class FamilyMemberCon {
	@Autowired
	FamilyMemberServ familiyMemberServ;
	
	//
	@PostMapping("/Save")
	public FamilyMember Save(@RequestBody FamilyMember familyMemberConSav) {
		return familiyMemberServ.save(familyMemberConSav);	
	}
	
	@PutMapping("/Update")
	public FamilyMember Update(@RequestBody FamilyMember familyMemberConUpd) {
		return familiyMemberServ.update(familyMemberConUpd);
	}

	@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Long id) {
		familiyMemberServ.delete(id);			
	}
			
	@GetMapping("/Get")
	public java.util.List<FamilyMember> findAll(){
		return familiyMemberServ.findAll(null);		
	}
	

}

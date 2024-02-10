package com.karina.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
	@Autowired
	BranchRepository brepo;
	@Autowired
	SubjectRepository srepo;
	
	@RequestMapping("/save")
	public String save()
	{
		Branch b=new Branch();
		b.setBname("Computer Science and Engineering");
		b.setBshortname("CSE");
		b.setBcode(905);
		
		Branch b1=new Branch();
		b1.setBname("Information Technology");
		b1.setBshortname("IT");
		b1.setBcode(909);
				
		
		Subject s=new Subject();
		s.setSname("JAVA");
		s.setScode(201);
		
		Subject s1=new Subject();
		s1.setSname("OOPS");
		s1.setScode(202);
		
		List<Branch> list=new ArrayList<Branch>();
		list.add(b);
		list.add(b1);
		
		s.setBranch(list);
		s1.setBranch(list);
				
		List<Subject> data= new ArrayList<Subject>();
		data.add(s);
		data.add(s1);
				
		b.setSubject(data);
		b1.setSubject(data);
		
		brepo.save(b);
		return "data saved";
		
		
	}
	
	@RequestMapping("/all")
	public List<Subject> all()
	{
		return srepo.findAll();
	}
	
	@RequestMapping("/hi/{bid}")
	public List<Branch> byid(@PathVariable int bid)
	{
		return brepo.findByBid(bid);
	}
	
	@RequestMapping("/hello/{sid}")
	public List<Subject> byhello(@PathVariable int sid)
	{
		return srepo.findBySid(sid);
	}
	
	@RequestMapping("/new/{sname}")
	public List<Subject> bynew(@PathVariable String sname)
	{
		return srepo.findBySname(sname);
	}
	
	@RequestMapping("/some/{bcode}")
	public List<Branch> bysome(@PathVariable int bcode)
	{
		return brepo.findByBcode(bcode);
	}
	
	@RequestMapping("/look/{scode}")
	public List<Subject> bycode(@PathVariable int scode)
	{
		return srepo.findByScode(scode);
	}
}

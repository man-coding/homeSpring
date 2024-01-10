package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.PersonDTO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/q1")
	public void q1(Model model) {
		
		PersonDTO personDTO = new PersonDTO("둘리", 20,"인천 구월동");
		model.addAttribute("dto", personDTO);
	}
	@GetMapping("/q2")
	public void q2(Model model) {
		
		BookDTO bookDTO = new BookDTO("스프링부트웹프로젝트","구멍가게코딩단",LocalDate.of(2022, 12, 25));
		
		model.addAttribute("dto",bookDTO);
	}
	
	@GetMapping("/q5")
	public void q5(Model model) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		model.addAttribute("dto",arr);
	}
	@GetMapping("/q7")
	public void q7(Model model) {
		List<PersonDTO> list = new ArrayList<>();
		
		list.add(new PersonDTO("박하나",25,"인천 구월동"));
		list.add(new PersonDTO("홍재범",17,"서울 신림동"));
		list.add(new PersonDTO("문유리",31,"부산 문래동"));
		list.add(new PersonDTO("김재민",8,"인천 연수동"));
		list.add(new PersonDTO("장유라",33,"부산 문래동"));
		
		model.addAttribute("list",list);
	}
}

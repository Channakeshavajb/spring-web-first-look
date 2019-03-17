package com.xworkz.web.componet;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.MessageDTO;
@Component
@RequestMapping("/")
public class MessageDTOComponent {	
public MessageDTOComponent() {
	System.out.println("created\t" + this.getClass().getSimpleName());
}

@RequestMapping("/onClickWithDto")
public String onDisplayClick(MessageDTO dto, ModelMap model) {
	System.out.println("Message"+dto.getMessage());
	model.addAttribute("dto", dto);
	return "/Desplay1.jsp";
	
}

}

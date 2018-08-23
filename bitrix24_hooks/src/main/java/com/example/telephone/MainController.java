package com.example.telephone;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Исходящие вебхуки
@Controller
@RequestMapping(path="/torg")
public class MainController {
	@GetMapping(path="/getData")
	public @ResponseBody String tovarInfo1(HttpServletRequest request) {
		//Массив значений параметров
		ArrayList<String> list = new ArrayList<String>();
		//Получим имена параметров
		Enumeration<String> v = request.getParameterNames();
		//Получим значения параметров и сохраним в list
		for (Enumeration<String> e = v; e.hasMoreElements();)
		{
			list.add(request.getParameter(e.nextElement()));
		}
		return "success";
	}

}

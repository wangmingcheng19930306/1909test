package cn.zj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.binding.StringFormatter;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
   
	@Autowired
	private UserService userService;
	
	//1.���в�ѯ
	@RequestMapping("/list")
	public String list(Model m){
		System.out.println("���������ҽ�����");
		List<User>list=userService.selectListService();
		System.out.println(list);
		m.addAttribute("users",list);
		return "userList";
		/*return null;*/
	}
	
	//2.�������
	@RequestMapping("/add")
	public ModelAndView  add(){
		int num=0;
		for(int i=1; i<=10 ;i++){
		    User u=new User(null,"����"+i,"123456"+i,26,"1234567891"+i,"921419601@qqcom", null);
		     num= userService.insertService(u);
		}
		if(num!=0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
		
		return null;
		
	}
	//3.ɾ���û���Ϣ
	@RequestMapping("/delete")
	public String delete(Integer userId,Model m){
		
	    int num=userService.deleterByPrimaryKeyService(userId);
	    if(num!=0){
		   m.addAttribute("message", "ɾ���ɹ�");
	    }else{
	       m.addAttribute("message", "ɾ��ʧ��");
	    }
		  //����ת��
	    // return  "forward:/user/list.do";
	     //һ��Ҫ�ã��ض�����ת���б�ҳ��
		return "redirect:/user/list.do";
		
	}
}

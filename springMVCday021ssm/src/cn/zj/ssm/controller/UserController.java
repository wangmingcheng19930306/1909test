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
	
	//1.多行查询
	@RequestMapping("/list")
	public String list(Model m){
		System.out.println("哈哈哈，我进来了");
		List<User>list=userService.selectListService();
		System.out.println(list);
		m.addAttribute("users",list);
		return "userList";
		/*return null;*/
	}
	
	//2.添加数据
	@RequestMapping("/add")
	public ModelAndView  add(){
		int num=0;
		for(int i=1; i<=10 ;i++){
		    User u=new User(null,"老王"+i,"123456"+i,26,"1234567891"+i,"921419601@qqcom", null);
		     num= userService.insertService(u);
		}
		if(num!=0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
		return null;
		
	}
	//3.删除用户信息
	@RequestMapping("/delete")
	public String delete(Integer userId,Model m){
		
	    int num=userService.deleterByPrimaryKeyService(userId);
	    if(num!=0){
		   m.addAttribute("message", "删除成功");
	    }else{
	       m.addAttribute("message", "删除失败");
	    }
		  //请求转发
	    // return  "forward:/user/list.do";
	     //一定要用：重定向跳转到列表页面
		return "redirect:/user/list.do";
		
	}
}

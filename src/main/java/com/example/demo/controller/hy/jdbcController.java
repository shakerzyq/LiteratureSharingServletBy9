package com.example.demo.controller.hy;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import com.example.demo.domain.User;
import com.example.demo.domain.work;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;



@Controller
@ResponseBody
@RequestMapping("/jdbc")
public class jdbcController {
    public static int count=125;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@RequestMapping(value = "/user",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public User findUserList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		User list = jdbcTemplate.queryForObject("select * from user where userid=?", new BeanPropertyRowMapper<User>(User.class),id);
		User u=new User();
		u.setUserid(list.getUserid());
		u.setUsername(list.getUsername());
		u.setPassword(list.getPassword());
		u.setBirthday(list.getBirthday());
		u.setSex(list.getSex());
		u.setAutograph(list.getAutograph());
		return u;
	}

	@RequestMapping(value = "/deletework",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public void delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		System.out.println("delete: " + id);
		int ans = jdbcTemplate.update("delete from work where workid = "+id);
		System.out.println("delete: " + ans);
	}

	@RequestMapping(value = "/getWork",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public List<work> getWork(HttpServletRequest request) {
		String id=request.getParameter("id");
		System.out.println(id);
		List<work> list  = jdbcTemplate.query("select * from work where userid="+id,
				new BeanPropertyRowMapper(work.class));
		return list;
	}

	@RequestMapping(value = "/updateUser",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public int updateUser(HttpServletRequest request) {
	    String u=request.getParameter("user");
	    System.out.println(u);
		Gson gson=new Gson();
		User user=gson.fromJson(u, new TypeToken<User>() {}.getType());
		int  result=jdbcTemplate.update("update user set username=?,sex=?,birthday=?," +
				"autograph=? where userid=?",user.getUsername(),user.getSex(),user.getBirthday(),user.getAutograph(),user.getUserid());
		return 1;
	}

    @RequestMapping(value = "/addwork",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public int addwork(HttpServletRequest request) {
        String u=request.getParameter("work");
        Gson gson=new Gson();
        work work=gson.fromJson(u, new TypeToken<work>() {}.getType());
		String x="";
		for(int n=0;n<10;n++ ) {
			x+=(int)(10*(Math.random()));
		}
        work.setWorkid(x);
        int  result=jdbcTemplate.update("insert into work values(?,?,?,?,?,?,?,?,?)",work.getWorkid(),work.getWorkname(),
                work.getWorktime(),work.getType(),work.getWorkcontent(),work.getPushstatus(),work.getAuditstatus(),work.getWorkzan(),
                work.getUserid());
        return result;
    }


}

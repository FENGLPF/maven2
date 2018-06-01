package com.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/common")
public class CommonController {
	private static Logger logger = Logger.getLogger(CommonController.class);
	
	@RequestMapping("/showfileUpLoad")
	public String showFileUpLoad(){
		return "test/fileUpLoad";
	}
	
	/**
	 * 图片上传
	 * @param file
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/fileUpLoad")
	@ResponseBody
	public String fileUpload(MultipartFile file,
			HttpServletRequest request) throws IOException{
		
		//使用UUID给图片重命名，并去掉四个“-”  
        String name = UUID.randomUUID().toString().replaceAll("-", "");  
        //获取文件的扩展名  
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());  
        //设置图片上传路径  
        String url = request.getSession().getServletContext().getRealPath("WEB-INF/file/picture"); 
        logger.info(url);
		String fileName = file.getOriginalFilename();
		//以绝对路径保存重名命后的图片  
        file.transferTo(new File(url+"/"+name + "." + ext));
        //重定向到查询所有用户的Controller，测试图片回显  
        return fileName;  
	}
	
	/**
	 * 404页面
	 * @return
	 */
	@RequestMapping("err404")
	public String error(){
		return "mylayui/404";
	}

	@RequestMapping("convertPicture")
	public String convertPicture(){
		return "mylayui/convertPicture";
	}
}

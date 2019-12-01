package com.ztkj.file;
;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传处理类
 */
@RestController
public class FileUploadCtr {

    @RequestMapping("/fileUpload")
    public Map<String,Object> fileUpload(MultipartFile fileName){
        Map<String, Object> map = new HashMap<String, Object>();
        String originalFilename = fileName.getOriginalFilename();
        System.out.println(originalFilename);
        try {
            File file = new File("E:/"+originalFilename);
            fileName.transferTo(file);
            map.put("msg","文件上传成功");
            return map;
        } catch (IOException e) {
            e.printStackTrace();
            map.put("msg","文件上传失败");
            return map;
        }
    }
}

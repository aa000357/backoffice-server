package com.happytuk.controller;

import com.happytuk.util.Error;
import com.happytuk.util.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@CrossOrigin
@RequestMapping("/upload")
@RestController
public class CkEditController {

    @PostMapping("/cke")
    public ResponseData ckeditUpload(@RequestParam(value = ("upload")) MultipartFile file, HttpServletRequest request){
        if(file == null){

            return new ResponseData(0, new Error("未上傳圖片"));
        }

        String originalFilename = file.getOriginalFilename();//取得上傳的圖片名稱
        String endStr = originalFilename.substring(originalFilename.lastIndexOf("."));//取得圖片副檔名

        String path = "C:/picture";
        File newMkdir = new File(path);
        //如果該文件夾不存在 -- 創建
        if(!newMkdir.exists()){
            newMkdir.mkdirs();
        }

        String uploadFile = System.currentTimeMillis()+endStr;//更改上傳文件名：時間戳+副檔名
        path += File.separator + uploadFile;//最終上傳地址
        try {
            file.transferTo(new File(path));//上傳
            //該圖片訪問地址
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/pic/" + uploadFile;
            System.out.println("url : "+ url);
            return new ResponseData(1, originalFilename,url);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseData(0, new Error("上傳失敗!"));
        }


    }
}

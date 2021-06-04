package Hrms.hrmsProject.configurations;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import Hrms.hrmsProject.core.utilities.cloudinary.CloudinaryManager;
import Hrms.hrmsProject.core.utilities.cloudinary.ImageService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Cloudinary cloudinaryService(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dnmqcdid2",
                "api_key", "447542234488253",
                "api_secret", "nYnX9q-jYtJBiAIDPe8EHT8h6Aw"));
    }

    @Bean
    public ImageService imageService(){
        return new CloudinaryManager(cloudinaryService());
    }
}
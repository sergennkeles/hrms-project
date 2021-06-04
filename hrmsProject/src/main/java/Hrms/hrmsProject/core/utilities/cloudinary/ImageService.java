package Hrms.hrmsProject.core.utilities.cloudinary;

import org.springframework.web.multipart.MultipartFile;

import Hrms.hrmsProject.core.utilities.results.DataResult;

public interface ImageService {
    DataResult<?> save(MultipartFile file);
}
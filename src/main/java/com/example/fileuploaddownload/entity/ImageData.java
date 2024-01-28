package com.example.fileuploaddownload.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ImageData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String type;
    private byte[] imageData;
}

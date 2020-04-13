package com.infocity;

import com.infocity.vo.Product;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author liaoqiangang
 * @date 2020/3/17 4:34 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 */
@SpringBootApplication
@MapperScan("com.infocity.mapper")
@EnableAutoConfiguration
public class ProductApp extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ProductApp.class);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(ProductApp.class);
  }
}

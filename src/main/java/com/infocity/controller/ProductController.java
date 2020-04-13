package com.infocity.controller;

import com.infocity.service.IProductService;
import com.infocity.vo.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liaoqiangang
 * @date 2020/3/17 4:36 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 */
@RestController
@RequestMapping("/product")
public class ProductController {
  @Resource private IProductService iProductService;


  @RequestMapping("/get/{id}")
  public Object get(@PathVariable("id") long id) {
    return iProductService.get(id);
  }

  @RequestMapping(value = "/add")
  public Object add(@RequestBody Product product) {
    return iProductService.add(product);
  }

  @RequestMapping("/list")
  public Object list() {
    return iProductService.list();
  }


  @RequestMapping("/hello")
  public String hello() {
    return "Hello World";
  }

}

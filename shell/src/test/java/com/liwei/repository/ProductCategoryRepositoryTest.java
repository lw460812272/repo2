package com.liwei.repository;

import com.liwei.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void fun(){
        ProductCategory productCategory =repository.findOne(1);
        productCategory.setCategoryType(111111);
        repository.save(productCategory);
       
    }

    @Test
   // @Transactional
    public void fun2(){
        ProductCategory p = new ProductCategory();
        p.setCategoryName("555");
        p.setCategoryType(555);
        ProductCategory productCategory =repository.save(p);
        System.out.println(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}
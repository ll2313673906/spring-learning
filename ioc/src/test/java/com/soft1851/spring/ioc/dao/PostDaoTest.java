//package com.soft1851.spring.ioc.dao;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.io.*;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import static org.junit.Assert.*;
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "/applicationContext.xml")
//public class PostDaoTest {
//    @Autowired
//    private PostDao postDao;
//    @Autowired
//    private Post post;
//
//    @Test
//    public void insert() throws IOException {
//        File file = new File("F:/360Downloads/1668.jpg");
//        InputStream in = new FileInputStream(file);
//        ByteArrayOutputStream out = new ByteArrayOutputStream((int) file.length());
//        int len = 0;
//        byte[] buffer = new byte[1024];
//        while ((len = in.read(buffer))!= -1){
//            out.write(buffer, 0, len);
//        }
//        System.out.println(buffer);
//        in.close();
//        out.close();
//        post = Post.builder().createTime(Timestamp.valueOf(LocalDateTime.now()))
//                .content("测试").forumId(1).title("测试标题").thumbnail(buffer).build();
//        postDao.insert(post);
//    }
//
//    @Test
//    public void batchInsert() throws IOException{
//        File file = new File("F:/360Downloads/1668.jpg");
//        InputStream in = new FileInputStream(file);
//        byte[] buffer = new byte[(int) file.length()];
//        in.read(buffer);
//        in.close();
//        in.close();
//        Post[] posts = {Post.builder().createTime(Timestamp.valueOf(LocalDateTime.now()))
//        .content("测试").forumId(1).title("测试标题").thumbnail(buffer).build(),
//        Post.builder().createTime(Timestamp.valueOf(LocalDateTime.now()))
//        .content("测试").forumId(1).title("测试标题").thumbnail(buffer).build()};
//        List<Post> postList = Arrays.asList(posts);
//        int[] rows = postDao.batchInsert(postList);
//        assertEquals(3,rows.length);
//
//
//    }
//
//    @Test
//    public void deleteInsert() {
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        int[] rows = postDao.deleteInsert(list);
//       assertEquals(2,rows.length);
//
//    }
//
//    @Test
//    public void deleteById() {
//        int n = postDao.deleteById(1);
//        assertEquals(1, n);
//        System.out.println(n);
//    }
//
//    @Test
//    public void getById() {
//        Post post = postDao.getById(5);
//        assertNotNull(post);
//        System.out.println(post);
//
//    }
//
//    @Test
//    public void getByKeywords() {
//        List<Post> postList = postDao.getByKeywords("测试");
//        assertNotNull(postList);
//        System.out.println(postList.size());
//
//    }
//
//    @Test
//    public void getCount() {
//        int n = postDao.getCount();
//        assertNotNull(n);
//        System.out.println(n);
//    }
//
//
//
//}
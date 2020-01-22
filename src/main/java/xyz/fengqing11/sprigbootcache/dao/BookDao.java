package xyz.fengqing11.sprigbootcache.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import xyz.fengqing11.sprigbootcache.pojo.Book;

@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {
    @Cacheable
    public Book getBookById(Integer id){
        System.out.println("getBookById");
        Book book = new Book();
        book.setId(id);
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        return book;
    }

    @CachePut(key = "#book.id")
    public Book updateBookById(Book book){
        System.out.println("uopdateBookById");
        book.setName("三国演义2");
        return book;
    }

    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }

}

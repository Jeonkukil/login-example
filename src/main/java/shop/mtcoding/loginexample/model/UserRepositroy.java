package shop.mtcoding.loginexample.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepositroy {

    public List<User> findAll();

    public User findById(int id);

    public int insert(@Param("username") String username, @Param("password") String password,
            @Param("email") String email);

    public int updateById(@Param("id") int id, @Param("username") String username,
            @Param("password") String password,
            @Param("email") String email);

    public int deleteById(int id);
}

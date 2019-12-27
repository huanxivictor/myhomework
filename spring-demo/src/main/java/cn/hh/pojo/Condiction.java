package cn.hh.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//无参构造函数
@NoArgsConstructor
//带参构造函数
@AllArgsConstructor
public class Condiction {
    private String username;
    private String sex;
    private Integer pageNo;
    private Integer pageSize;
    private String xxxx;
}

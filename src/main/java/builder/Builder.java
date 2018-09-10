package builder;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/10
 **/
public interface Builder {
    /**
     *组装CPU
     */
    void buildCPU();

    /**
     *组装主板
     */
    void buildMainBoard();

    /**
     * 组装硬盘
     */
    void buildHD();
}

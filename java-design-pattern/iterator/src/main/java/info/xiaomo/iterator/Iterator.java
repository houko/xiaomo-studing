package info.xiaomo.iterator;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/18 13:35
 * desc  : 迭代器接口
 * Copyright(©) 2017 by xiaomo.
 */
public interface Iterator {

    /**
     * has next
     *
     * @return
     */
    boolean hasNext();

    /**
     * next
     *
     * @return
     */
    Object next();
}

package xiaomo.command.command;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 19:39
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public interface Command {

    /**
     * execute
     */
    void execute();

    /**
     * undo
     */
    void undo();
}

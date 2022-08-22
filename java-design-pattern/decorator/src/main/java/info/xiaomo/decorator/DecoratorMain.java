package info.xiaomo.decorator;

import info.xiaomo.decorator.bean.Beverage;
import info.xiaomo.decorator.bean.HouseBlend;
import info.xiaomo.decorator.decortor.Milk;
import info.xiaomo.decorator.decortor.Mocha;
import lombok.extern.slf4j.Slf4j;

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
 * Date  : 2017/7/17 17:14
 * desc  : 装饰器模式
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();

        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        log.info(beverage.getDescription());
        double cost = beverage.cost();
        log.info("", cost);
    }

}

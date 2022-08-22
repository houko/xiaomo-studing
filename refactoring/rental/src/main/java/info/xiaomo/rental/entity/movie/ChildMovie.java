package info.xiaomo.rental.entity.movie;

import info.xiaomo.rental.constant.MovieEnum;
import info.xiaomo.rental.entity.customer.Customer;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/5/31 10:19
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class ChildMovie extends Movie {


    public ChildMovie(Customer customer, long id, String name, int days) {
        super(customer, id, name, days);
    }

    public double getPrice() {
        return 6 * days * customer.getDiscount();
    }

    public MovieEnum getMovieType() {
        return MovieEnum.CHILD;
    }
}

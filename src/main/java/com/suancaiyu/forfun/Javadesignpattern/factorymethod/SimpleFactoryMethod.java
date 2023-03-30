package com.suancaiyu.forfun.Javadesignpattern.factorymethod;

/**
 * @author heyred
 */
public class SimpleFactoryMethod {
    //通过接口获取具体的对象
    public static Car getCar(String type){
        switch (type){
            case "bwm":
                return new Bwm();
            case "benzi":
                return new Benzi();
            default:
                return null;
        }
    }

    public static Car getCar1(Class<? extends Car> clazz) throws InstantiationException, IllegalAccessException {
        if (clazz !=null){
            return clazz.newInstance();
        }
        return null;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //获取对应的对象
        String bwm = SimpleFactoryMethod.getCar("bwm").save();
        String bwm1 = SimpleFactoryMethod.getCar1(Benzi.class).save();
        String benzi = SimpleFactoryMethod.getCar("benzi").save();
        System.out.println(bwm);
        System.out.println(bwm1);
        System.out.println(benzi);
    }
}

package com.fei.main.part3.section15_7;
/**
 * 不完全单例类(默 认 实 例 模 式)(本书建议读者不要这样做)
 * 造成这种情况出现的原因有以下几种可能：
 ( 1 ) 初学者的错误。 许多初学者没有认识到单例类的构造子不能是公开的， 因此犯
 下这个错误。 有些初学 Java 语言的学员甚至不知道 •个 Java 类的构造子可以不是公开的。
 在这种情况下， 设计师可能会通过自我约束， 也就是说不去调用构造子的办法， 将这个不
 完全的单例类在使用中作为一个单例类使用。
 在这种情况下， 一个简单的矫正办法， 就是将公开的构造子改为私有的构造子。
 (2) 当初出于考虑不周， 将一个类设计成为单例类， 后来发现此类应当有多于一个
 的实例。 为了弥补错误， 干脆将构造子改为公开的， 以便在需要多于一个的实例时， 可以
 随时调用构造子创建新的实例。
 要纠正这种情况较为困难， 必须根据具体情况做出改进的决定。 如果一个类在最初被
 设计成为单例类， 但后来发现实际上此类应当有有限多个实例， 这时候应当考虑是否将单
 例类改为多例类（Multiton)。
 ( 3) 设计师的 Java 知识很好， 而且也知道单例模式的正确使用方法， 但是， 还是有
 意使用这种不完全的单例模式， 因为他意在使用一种“改良” 的单例模式。 这时候， 除去
 共有的构造子不符合单例模式的要求之外， 这个类必须是很好的单例模式
 * @author xurunfei
 * @date: 2017/11/28 15:47
 */
public class LazySingleton {
    private static LazySingleton
            m_instance = null;

    /**
     * 公开的构造子， 外界可以直接实例化
     */
    public LazySingleton() {
    }

    /* * 静态工厂方法
     * @retum 返还 LazySingleton 类的惟一实例
     */
    synchronized public static LazySingleton getlnstance() {
        if (m_instance == null) {
            m_instance = new LazySingleton();
        }
        return m_instance;
    }
}
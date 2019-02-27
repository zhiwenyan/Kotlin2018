package chapter08

/**
 * Description:
 * Data：2019/1/25
 * Author: Steven
 */
@Target(AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewById(val value:Int){
}

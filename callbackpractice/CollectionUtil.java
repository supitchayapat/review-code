package callbackpractice;

import java.util.Comparator;

public class CollectionUtil {

    public static void sort(Object[] a, Comparator cmp) {
        for (int i = 0; i < a.length - 1; i++) {// i แบ่งส่วนเรียงแล้วกับยังไม่เรียง
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {  // วนลูปหาค่าน้อยสุด
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            // สลับข้อมูลใน minPos และ i ทำให้ข้อมูลใน minPos ไปอยู่ส่วนที่เรียงแล้ว
            Object temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}

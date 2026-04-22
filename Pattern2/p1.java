class Pattern {
void show() {
int n = 5;
for (int i = 0; i < n; i++) {
for (int j = 0; j <= i; j++) {
if (j == 0 || j == i || i == n - 1) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}
public class p1 {
public static void main(String[] args) {
Pattern p = new Pattern();
p.show();
}
}
class Pattern {
void show() {
int n = 5;
for (int i = n; i >= 1; i--) {
for (int j = 1; j <= i; j++) {
if (j == 1 || j == i || i == n) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}
public class p2 {
public static void main(String[] args) {
Pattern p = new Pattern();
p.show();
}
}
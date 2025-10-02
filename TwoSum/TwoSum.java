package TwoSum;

import java.util.Scanner;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // função main só coleta os inputs e usa o twoSum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Digite os " + n + " números separados por espaço:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Target: ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        int[] res = obj.twoSum(nums, target);

        if (res.length == 2) {
            System.out.println("Índices encontrados: [" + res[0] + ", " + res[1] + "]");
            System.out.println("Valores: [" + nums[res[0]] + ", " + nums[res[1]] + "]");
        } else {
            System.out.println("Nenhum par soma o target.");
        }

        sc.close();
    }
}

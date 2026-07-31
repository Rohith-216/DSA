class Solution {
    public int minimumPushes(String word) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map = sortHashMap(word);

        int len = map.size();
        int rem = len % 8;
        int quo = len / 8;

        List<Integer> values = new ArrayList<>(map.values());
        int minimumPushes = 0;
        if (quo == 1) {
            if (rem == 0) {
                return getSum(values, 1);
            } else {
                minimumPushes = getSum(values.subList(0, rem), 2);
                minimumPushes += getSum(values.subList(rem, values.size()), 1);
                return minimumPushes;
            }
        } else if (quo == 2) {
            if (rem == 0) {
                minimumPushes = getSum(values.subList(0, 8), 2);
                minimumPushes += getSum(values.subList(8, values.size()), 1);
                return minimumPushes;
            } else {
                minimumPushes = getSum(values.subList(0, rem), 3);
                minimumPushes += getSum(values.subList(rem, rem + 8), 2);
                minimumPushes += getSum(values.subList(rem + 8, values.size()), 1);
                return minimumPushes;
            }
        } else if (quo == 3) {
            if (rem == 0) {
                minimumPushes = getSum(values.subList(0, 8), 3);
                minimumPushes += getSum(values.subList(8, 16), 2);
                minimumPushes += getSum(values.subList(16, values.size()), 1);
                return minimumPushes;
            } else {
                minimumPushes = getSum(values.subList(0, rem), 4);
                minimumPushes += getSum(values.subList(rem, rem + 8), 3);
                minimumPushes += getSum(values.subList(rem + 8, rem + 16), 2);
                minimumPushes += getSum(values.subList(rem + 16, values.size()), 1);
                return minimumPushes;
            }
        }

        minimumPushes = getSum(values, 1);
        return minimumPushes;
    }

    public LinkedHashMap<Character, Integer> sortHashMap(String word) {
        HashMap<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            temp.put(word.charAt(i), temp.getOrDefault(word.charAt(i), 0) + 1);
        }

        LinkedHashMap<Character, Integer> sortedMap = temp.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        return sortedMap;
    }

    public int getSum(List<Integer> sublist, int k) {
        int sum = 0;
        for (int i = 0; i < sublist.size(); i++) {
            sum += k * sublist.get(i);
        }
        return sum;
    }
}
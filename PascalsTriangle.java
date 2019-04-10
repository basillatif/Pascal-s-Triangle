class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pascalsNumbers = new ArrayList<Integer>();
        if(rowIndex < 0){
            return pascalsNumbers;
        }

        for(int i = 0; i < rowIndex + 1; i++){
            pascalsNumbers.add(0, 1);
            for(int j = 1; j < pascalsNumbers.size() - 1; j++){
                pascalsNumbers.set(j, pascalsNumbers.get(j) + pascalsNumbers.get(j + 1));
            }
        }
      return pascalsNumbers;
    }
}

class Parcels {
  public Integer mLength;
  public Integer mWidth;
  public Integer mHeight;
  public Integer mWeight;
  public Integer mDistance;
  public Integer mVolume;
  public Integer mCost;
  public String mSpeed;
  public Boolean mWrapping;

  public Parcels(int length, int width, int height, int weight, int distance, String speed, boolean wrapping) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mDistance = distance;
    mVolume = 0;
    mCost = 0;
    mSpeed = speed;
    mWrapping = wrapping;
  }
  public void calculateVolume() {
    mVolume = mLength * mWidth * mHeight;
    //return mVolume;
  }
  public void costToShip() {
    //initial calculation for shipping cost
    mCost = mWeight/5 * (mDistance/10 * 4);
    //factor delivery method
    if (mSpeed.equals("priority")) {
      mCost *= 3;
    } else if (mSpeed.equals("2-day")) {
      mCost *= 2;
    } else if (mSpeed.equals("ground")) {
      mCost *= 1;
    }
    //factor in gift wrapping
    if (mWrapping == true) {
      mCost += 10;
    }
    //return mCost;
  }

}

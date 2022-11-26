const paymentByCash = (amount) => {
  return amount;
};

const paymentByBanking = (amount) => {
  return amount * 0.9;
};

const paymentByCoin = (amount) => {
  return amount * 0.5;
};

const paymentStategy = {
  cash: paymentByCash,
  banking: paymentByBanking,
  coin: paymentByCoin,
};

const getPrice = (type) => {
  return paymentStategy[type](100);
};

console.log("Price: ", getPrice("banking"));

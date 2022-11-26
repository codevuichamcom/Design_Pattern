class Observer {
  constructor(name) {
    this.name = name;
  }
  ping(subject, localtion) {
    subject.notify(this.name, localtion);
  }
  showLocation(name, location) {
    console.log(
      `Account:${this.name}
      ${name} PING::::: from localtion: ${JSON.stringify(location)}`
    );
  }
}

class Subject {
  constructor() {
    this.observers = [];
  }

  registerObserver(observer) {
    this.observers.push(observer);
  }

  notify(name, localtion) {
    this.observers.forEach((observer) =>
      observer.showLocation(name, localtion)
    );
  }
}

const JinX = new Observer("JinX");
const LeeSin = new Observer("LeeSin");
const Garen = new Observer("Garen");

const subject = new Subject();
subject.registerObserver(JinX);
subject.registerObserver(LeeSin);
subject.registerObserver(Garen);

LeeSin.ping(subject, { lat: 100, lon: 500 });

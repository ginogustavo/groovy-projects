
def t = new Thread(){/*do something*/}
t.start()

Thread.start{/*do something*/}
Thread.start('Thread-name'){/*do something*/}

Thread.startDaemon {/*do something*/}
Thread.startDaemon ('daemon-name'){/*do something*/}

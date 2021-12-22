def getevents(team1, team2, event1, event2):
    dict = {}
    
    for s in event1:
        arr = [" ".split(s)]
        if len(arr) == 5 and arr[3] == "S":
            time = arr[2]


class compare:
    def __init__ (self, a, b):
        self.a = a
        self.b = b
        
    def __lt__ (self, other):
        if self.a == other.a:
            return 
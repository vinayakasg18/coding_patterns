from typing import List

class Tools:
    def tools_min(self, tools: List, target: str, start: int) -> int:
        tools = tools[start:] + tools[0: start]
        temp = -1
        
        for i in range (len(tools)):
            if(tools[i]==target):
                temp = i

        return min (temp, len(tools)-temp)
    
print(Tools().tools_min(["ballendmill", "keywaycutter", "slotdrill", "facemill"], "ballendmill", 1))
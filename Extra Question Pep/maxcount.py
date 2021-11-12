# TC o(n) + o(n) = o(n) && dict is hasmap in java
a = 'asabcdaeaf'
dict1 = {}
for i in a:
    if i in dict1:
        dict1[i] +=1
    else:
        dict1[i] = 1
ans = ''
val = 0
for k,v in dict1.items():
    if v > val:
        val = v
        ans = k

print(ans) 



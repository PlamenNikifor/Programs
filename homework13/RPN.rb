p 'Vuvedete izraza(RPN!)'
izraz = gets
result = 0
calc = RPN1.new
stack = []
i = izraz.length
while(izraz.length >= stack.length)
  stack.push(izraz[i])
  i = i-1
end
i = 0
while(stack.length > 0)
  izraz[i]=stack.pop()
  if(izraz[i]='+')
    result = calc.add(izraz[i-1].to_f, izraz[i-2].to_f)
    stack.push(izraz[i-3])
    stack.push(result)
  end  

  if(izraz[i]='-')
    result = calc.sub(izraz[i-1].to_f, izraz[i-2].to_f)
    stack.push(izraz[i-3])
    stack.push(result)
  end  

  if(izraz[i]='*')
    result = calc.mul(izraz[i-1].to_f, izraz[i-2].to_f)
    stack.push(izraz[i-3])
    stack.push(result)
  end

  if(izraz[i]='/')
   result = calc.div(izraz[i-1].to_f, izraz[i-2].to_f)
   stack.push(izraz[i-3])
   stack.push(result)
  end
  i = i+1
 end
 p result 

   

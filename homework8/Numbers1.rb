require 'csv'
i=1
high=0
low=0
q=Array.new(29)
Dir.glob('*.csv').each do |f|
	CSV.foreach(f) do |line|
		i=1
		while i<=30 do
			if line[2]==i
				q[i]=q[i]+1
				i+=1	
			end
		end
	end
end
high=i
while i>=1 do	
	if q[i-1]>q[i]
		high=i
		i-=1
	end
end 
p high
p q[high]
low=i
while i<=30 do
	if q[i-1]>q[i]
		low=i
		i+=1 
	end
end
p low
p q[low]

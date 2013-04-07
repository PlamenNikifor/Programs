class Array
	def densities
		a=map{ |item| count item }
		p a
	end
	def subarray_count(subarray)
		i=0
		each_cons(2) do|cons|
			if cons == subarray
				i = i+1		
			end
		end
		p i
	end
	def to_hash
		b = Hash.new(0)
		each_slice(2) do |k,v|
			p "#{k} => #{v} "
		end
	end
	def occurences_count
		b = Hash.new(0)
		each do |v|
			b[v] += 1
		end
		b.each do |k,v|
			p "#{k} => #{v} "
		end		
	
	end
end
[1,2,3,2,3,1].subarray_count([2, 3])
[:a, :b, :a].occurences_count
[:a, :b, :a].densities
[1,1,2,2,3,3].to_hash






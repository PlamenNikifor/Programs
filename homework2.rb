require 'csv'

def process_1
	a = File.open("/home/csv_example.csv", "r")
	content = f.read
	ruby = 0
	python = 0
	content.each_line do |line|
	mass = line.split(",")
	if mass[4] == 'ruby'
		ruby = ruby + mass[2].to_i
	end
	if mass[4] == 'python'
		pyhon = python + mass[2].to_i 
	end
	p python
	p ruby
end

process_1
